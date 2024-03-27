package runner;

import org.monte.media.Format;
import org.monte.media.FormatKeys;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class ScreenRecorderExample {
    private ScreenRecorder screenRecorder;

    public void startRecording() throws Exception {
        // Set up screen recorder
        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        this.screenRecorder = new ScreenRecorder(gc, null,
                new Format(MediaTypeKey, FormatKeys.MediaType.FILE, MimeTypeKey, MIME_AVI),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, (int) 24, FrameRateKey,
                        Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, (int) (15 * 60)),
                null);
        this.screenRecorder.start();
    }

    public void stopRecording() throws Exception {
        // Stop screen recorder
        this.screenRecorder.stop();
    }

    public static void main(String[] args) {
        ScreenRecorderExample recorder = new ScreenRecorderExample();
        try {
            // Start recording
            recorder.startRecording();

            // Sleep for 10 seconds (you can replace this with your test execution)
            Thread.sleep(10000);

            // Stop recording
            recorder.stopRecording();

            System.out.println("Recording completed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

