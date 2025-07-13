package p371v5;

/* renamed from: v5.j */
/* loaded from: classes.dex */
public final class RunnableC6560j implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {

    /* renamed from: e0 */
    public static final int[] f25648e0 = null;

    /* renamed from: Y */
    public final android.os.Handler f25649Y;

    /* renamed from: Z */
    public final int[] f25650Z;

    /* renamed from: a0 */
    public android.opengl.EGLDisplay f25651a0;

    /* renamed from: b0 */
    public android.opengl.EGLContext f25652b0;

    /* renamed from: c0 */
    public android.opengl.EGLSurface f25653c0;

    /* renamed from: d0 */
    public android.graphics.SurfaceTexture f25654d0;

    /* renamed from: v5.j$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: v5.j$b */
    public static final class b extends java.lang.RuntimeException {
        public b(java.lang.String r1, p371v5.RunnableC6560j.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            r0 = 17
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344} // fill-array
            p371v5.RunnableC6560j.f25648e0 = r0
            return
    }

    public RunnableC6560j(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.f25649Y = r1
            r1 = 1
            int[] r1 = new int[r1]
            r0.f25650Z = r1
            return
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture r1) {
            r0 = this;
            android.os.Handler r1 = r0.f25649Y
            r1.post(r0)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.f25654d0
            if (r0 == 0) goto L7
            r0.updateTexImage()     // Catch: java.lang.RuntimeException -> L7
        L7:
            return
    }
}
