package p413xb;

/* renamed from: xb.d */
/* loaded from: classes.dex */
public final class C7021d {

    /* renamed from: c */
    public static final /* synthetic */ int f27342c = 0;

    /* renamed from: a */
    public final android.content.Context f27343a;

    /* renamed from: b */
    public boolean f27344b;

    public C7021d(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f27344b = r0
            r0 = 3
            r2.setVolumeControlStream(r0)
            android.content.Context r2 = r2.getApplicationContext()
            r1.f27343a = r2
            return
    }

    /* renamed from: a */
    public android.media.MediaPlayer m14173a() {
            r8 = this;
            android.media.MediaPlayer r6 = new android.media.MediaPlayer
            r6.<init>()
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
            r0.<init>()
            r1 = 2
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
            android.media.AudioAttributes r0 = r0.build()
            r6.setAudioAttributes(r0)
            xb.b r0 = p413xb.C7019b.f27340a
            r6.setOnCompletionListener(r0)
            xb.c r0 = p413xb.C7020c.f27341a
            r6.setOnErrorListener(r0)
            android.content.Context r0 = r8.f27343a     // Catch: java.io.IOException -> L52
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.io.IOException -> L52
            r1 = 2131886086(0x7f120006, float:1.940674E38)
            android.content.res.AssetFileDescriptor r7 = r0.openRawResourceFd(r1)     // Catch: java.io.IOException -> L52
            java.io.FileDescriptor r1 = r7.getFileDescriptor()     // Catch: java.lang.Throwable -> L4d
            long r2 = r7.getStartOffset()     // Catch: java.lang.Throwable -> L4d
            long r4 = r7.getLength()     // Catch: java.lang.Throwable -> L4d
            r0 = r6
            r0.setDataSource(r1, r2, r4)     // Catch: java.lang.Throwable -> L4d
            r7.close()     // Catch: java.io.IOException -> L52
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r6.setVolume(r0, r0)     // Catch: java.io.IOException -> L52
            r6.prepare()     // Catch: java.io.IOException -> L52
            r6.start()     // Catch: java.io.IOException -> L52
            return r6
        L4d:
            r0 = move-exception
            r7.close()     // Catch: java.io.IOException -> L52
            throw r0     // Catch: java.io.IOException -> L52
        L52:
            r0 = move-exception
            java.lang.String r1 = "d"
            android.util.Log.w(r1, r0)
            r6.reset()
            r6.release()
            r0 = 0
            return r0
    }
}
