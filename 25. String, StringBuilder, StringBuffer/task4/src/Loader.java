public class Loader {
    private static final String PROGRESS_BAR_SYMBOL = "%";
    private static final long PAUSE_BAR_MILLIS = 200;
    private static final double PROGRESS_STEP = 0.75;
    private static final double PROGRESS_MAX_VALUE = 100;
    private static final int PROGRESS_BAR_LENGTH = 10;
    private static final String PRINT_FORMAT = "Wczytywanie %c %5.2f %% (%-" + PROGRESS_BAR_LENGTH + "s)\r";

    public static void main(String[] args) {

        double progress = 0.0;

        for (int i = 0; progress <= PROGRESS_MAX_VALUE; i++) {

            String progressBar = getProgressBar(progress);
            char progressIndicator = i % 2 == 0? '/' : '\\';
            System.out.printf(PRINT_FORMAT, progressIndicator, progress, progressBar);
            progress = i * PROGRESS_STEP;
            pause();
        }

    }

    private static String getProgressBar(double progress) {
        double progressBarStep = PROGRESS_MAX_VALUE / PROGRESS_BAR_LENGTH;
        int numberDots = (int) (progress / progressBarStep);
        return PROGRESS_BAR_SYMBOL.repeat(numberDots);
    }

    private static void pause() {
        try {
            Thread.sleep(PAUSE_BAR_MILLIS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
