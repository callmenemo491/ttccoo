package p387w5;

/* renamed from: w5.d */
/* loaded from: classes.dex */
public final class C6801d extends android.view.Surface {

    /* renamed from: b0 */
    public static int f26412b0;

    /* renamed from: c0 */
    public static boolean f26413c0;

    /* renamed from: Y */
    public final boolean f26414Y;

    /* renamed from: Z */
    public final p387w5.C6801d.b f26415Z;

    /* renamed from: a0 */
    public boolean f26416a0;

    /* renamed from: w5.d$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: w5.d$b */
    public static class b extends android.os.HandlerThread implements android.os.Handler.Callback {

        /* renamed from: Y */
        public p371v5.RunnableC6560j f26417Y;

        /* renamed from: Z */
        public android.os.Handler f26418Z;

        /* renamed from: a0 */
        public java.lang.Error f26419a0;

        /* renamed from: b0 */
        public java.lang.RuntimeException f26420b0;

        /* renamed from: c0 */
        public p387w5.C6801d f26421c0;

        public b() {
                r1 = this;
                java.lang.String r0 = "ExoPlayer:DummySurface"
                r1.<init>(r0)
                return
        }

        /* renamed from: a */
        public final void m13839a(int r19) {
                r18 = this;
                r0 = r18
                r1 = r19
                v5.j r2 = r0.f26417Y
                java.util.Objects.requireNonNull(r2)
                v5.j r2 = r0.f26417Y
                java.util.Objects.requireNonNull(r2)
                r3 = 0
                android.opengl.EGLDisplay r4 = android.opengl.EGL14.eglGetDisplay(r3)
                r12 = 0
                if (r4 == 0) goto Le9
                r13 = 2
                int[] r5 = new int[r13]
                r14 = 1
                boolean r5 = android.opengl.EGL14.eglInitialize(r4, r5, r3, r5, r14)
                if (r5 == 0) goto Le1
                r2.f25651a0 = r4
                android.opengl.EGLConfig[] r15 = new android.opengl.EGLConfig[r14]
                int[] r11 = new int[r14]
                int[] r5 = p371v5.RunnableC6560j.f25648e0
                r6 = 0
                r8 = 0
                r9 = 1
                r16 = 0
                r7 = r15
                r10 = r11
                r17 = r11
                r11 = r16
                boolean r4 = android.opengl.EGL14.eglChooseConfig(r4, r5, r6, r7, r8, r9, r10, r11)
                r5 = 3
                if (r4 == 0) goto Lc1
                r6 = r17[r3]
                if (r6 <= 0) goto Lc1
                r6 = r15[r3]
                if (r6 == 0) goto Lc1
                r4 = r15[r3]
                android.opengl.EGLDisplay r6 = r2.f25651a0
                r7 = 5
                if (r1 != 0) goto L4f
                int[] r5 = new int[r5]
                r5 = {x00f2: FILL_ARRAY_DATA , data: [12440, 2, 12344} // fill-array
                goto L54
            L4f:
                int[] r5 = new int[r7]
                r5 = {x00fc: FILL_ARRAY_DATA , data: [12440, 2, 12992, 1, 12344} // fill-array
            L54:
                android.opengl.EGLContext r8 = android.opengl.EGL14.EGL_NO_CONTEXT
                android.opengl.EGLContext r5 = android.opengl.EGL14.eglCreateContext(r6, r4, r8, r5, r3)
                if (r5 == 0) goto Lb9
                r2.f25652b0 = r5
                android.opengl.EGLDisplay r6 = r2.f25651a0
                if (r1 != r14) goto L65
                android.opengl.EGLSurface r4 = android.opengl.EGL14.EGL_NO_SURFACE
                goto L79
            L65:
                if (r1 != r13) goto L6e
                r7 = 7
                int[] r7 = new int[r7]
                r7 = {x010a: FILL_ARRAY_DATA , data: [12375, 1, 12374, 1, 12992, 1, 12344} // fill-array
                goto L73
            L6e:
                int[] r7 = new int[r7]
                r7 = {x011c: FILL_ARRAY_DATA , data: [12375, 1, 12374, 1, 12344} // fill-array
            L73:
                android.opengl.EGLSurface r4 = android.opengl.EGL14.eglCreatePbufferSurface(r6, r4, r7, r3)
                if (r4 == 0) goto Lb1
            L79:
                boolean r5 = android.opengl.EGL14.eglMakeCurrent(r6, r4, r4, r5)
                if (r5 == 0) goto La9
                r2.f25653c0 = r4
                int[] r4 = r2.f25650Z
                android.opengl.GLES20.glGenTextures(r14, r4, r3)
                p371v5.C6562l.m13350a()
                android.graphics.SurfaceTexture r4 = new android.graphics.SurfaceTexture
                int[] r5 = r2.f25650Z
                r5 = r5[r3]
                r4.<init>(r5)
                r2.f25654d0 = r4
                r4.setOnFrameAvailableListener(r2)
                w5.d r2 = new w5.d
                v5.j r4 = r0.f26417Y
                android.graphics.SurfaceTexture r4 = r4.f25654d0
                java.util.Objects.requireNonNull(r4)
                if (r1 == 0) goto La3
                r3 = 1
            La3:
                r2.<init>(r0, r4, r3, r12)
                r0.f26421c0 = r2
                return
            La9:
                v5.j$b r1 = new v5.j$b
                java.lang.String r2 = "eglMakeCurrent failed"
                r1.<init>(r2, r12)
                throw r1
            Lb1:
                v5.j$b r1 = new v5.j$b
                java.lang.String r2 = "eglCreatePbufferSurface failed"
                r1.<init>(r2, r12)
                throw r1
            Lb9:
                v5.j$b r1 = new v5.j$b
                java.lang.String r2 = "eglCreateContext failed"
                r1.<init>(r2, r12)
                throw r1
            Lc1:
                v5.j$b r1 = new v5.j$b
                java.lang.Object[] r2 = new java.lang.Object[r5]
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r2[r3] = r4
                r4 = r17[r3]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r14] = r4
                r3 = r15[r3]
                r2[r13] = r3
                java.lang.String r3 = "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s"
                java.lang.String r2 = p371v5.C6552b0.m13318k(r3, r2)
                r1.<init>(r2, r12)
                throw r1
            Le1:
                v5.j$b r1 = new v5.j$b
                java.lang.String r2 = "eglInitialize failed"
                r1.<init>(r2, r12)
                throw r1
            Le9:
                v5.j$b r1 = new v5.j$b
                java.lang.String r2 = "eglGetDisplay failed"
                r1.<init>(r2, r12)
                throw r1
        }

        /* renamed from: b */
        public final void m13840b() {
                r7 = this;
                v5.j r0 = r7.f26417Y
                java.util.Objects.requireNonNull(r0)
                v5.j r0 = r7.f26417Y
                android.os.Handler r1 = r0.f25649Y
                r1.removeCallbacks(r0)
                r1 = 19
                r2 = 0
                android.graphics.SurfaceTexture r3 = r0.f25654d0     // Catch: java.lang.Throwable -> L6f
                if (r3 == 0) goto L1d
                r3.release()     // Catch: java.lang.Throwable -> L6f
                r3 = 1
                int[] r4 = r0.f25650Z     // Catch: java.lang.Throwable -> L6f
                r5 = 0
                android.opengl.GLES20.glDeleteTextures(r3, r4, r5)     // Catch: java.lang.Throwable -> L6f
            L1d:
                android.opengl.EGLDisplay r3 = r0.f25651a0
                if (r3 == 0) goto L32
                android.opengl.EGLDisplay r4 = android.opengl.EGL14.EGL_NO_DISPLAY
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L32
                android.opengl.EGLDisplay r3 = r0.f25651a0
                android.opengl.EGLSurface r4 = android.opengl.EGL14.EGL_NO_SURFACE
                android.opengl.EGLContext r5 = android.opengl.EGL14.EGL_NO_CONTEXT
                android.opengl.EGL14.eglMakeCurrent(r3, r4, r4, r5)
            L32:
                android.opengl.EGLSurface r3 = r0.f25653c0
                if (r3 == 0) goto L45
                android.opengl.EGLSurface r4 = android.opengl.EGL14.EGL_NO_SURFACE
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L45
                android.opengl.EGLDisplay r3 = r0.f25651a0
                android.opengl.EGLSurface r4 = r0.f25653c0
                android.opengl.EGL14.eglDestroySurface(r3, r4)
            L45:
                android.opengl.EGLContext r3 = r0.f25652b0
                if (r3 == 0) goto L4e
                android.opengl.EGLDisplay r4 = r0.f25651a0
                android.opengl.EGL14.eglDestroyContext(r4, r3)
            L4e:
                int r3 = p371v5.C6552b0.f25624a
                if (r3 < r1) goto L55
                android.opengl.EGL14.eglReleaseThread()
            L55:
                android.opengl.EGLDisplay r1 = r0.f25651a0
                if (r1 == 0) goto L66
                android.opengl.EGLDisplay r3 = android.opengl.EGL14.EGL_NO_DISPLAY
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L66
                android.opengl.EGLDisplay r1 = r0.f25651a0
                android.opengl.EGL14.eglTerminate(r1)
            L66:
                r0.f25651a0 = r2
                r0.f25652b0 = r2
                r0.f25653c0 = r2
                r0.f25654d0 = r2
                return
            L6f:
                r3 = move-exception
                android.opengl.EGLDisplay r4 = r0.f25651a0
                if (r4 == 0) goto L85
                android.opengl.EGLDisplay r5 = android.opengl.EGL14.EGL_NO_DISPLAY
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L85
                android.opengl.EGLDisplay r4 = r0.f25651a0
                android.opengl.EGLSurface r5 = android.opengl.EGL14.EGL_NO_SURFACE
                android.opengl.EGLContext r6 = android.opengl.EGL14.EGL_NO_CONTEXT
                android.opengl.EGL14.eglMakeCurrent(r4, r5, r5, r6)
            L85:
                android.opengl.EGLSurface r4 = r0.f25653c0
                if (r4 == 0) goto L98
                android.opengl.EGLSurface r5 = android.opengl.EGL14.EGL_NO_SURFACE
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L98
                android.opengl.EGLDisplay r4 = r0.f25651a0
                android.opengl.EGLSurface r5 = r0.f25653c0
                android.opengl.EGL14.eglDestroySurface(r4, r5)
            L98:
                android.opengl.EGLContext r4 = r0.f25652b0
                if (r4 == 0) goto La1
                android.opengl.EGLDisplay r5 = r0.f25651a0
                android.opengl.EGL14.eglDestroyContext(r5, r4)
            La1:
                int r4 = p371v5.C6552b0.f25624a
                if (r4 < r1) goto La8
                android.opengl.EGL14.eglReleaseThread()
            La8:
                android.opengl.EGLDisplay r1 = r0.f25651a0
                if (r1 == 0) goto Lb9
                android.opengl.EGLDisplay r4 = android.opengl.EGL14.EGL_NO_DISPLAY
                boolean r1 = r1.equals(r4)
                if (r1 != 0) goto Lb9
                android.opengl.EGLDisplay r1 = r0.f25651a0
                android.opengl.EGL14.eglTerminate(r1)
            Lb9:
                r0.f25651a0 = r2
                r0.f25652b0 = r2
                r0.f25653c0 = r2
                r0.f25654d0 = r2
                throw r3
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 1
                if (r0 == r1) goto L1f
                r4 = 2
                if (r0 == r4) goto L9
                return r1
            L9:
                r3.m13840b()     // Catch: java.lang.Throwable -> L10
            Lc:
                r3.quit()
                goto L19
            L10:
                r4 = move-exception
                java.lang.String r0 = "DummySurface"
                java.lang.String r2 = "Failed to release dummy surface"
                p371v5.C6565o.m13369b(r0, r2, r4)     // Catch: java.lang.Throwable -> L1a
                goto Lc
            L19:
                return r1
            L1a:
                r4 = move-exception
                r3.quit()
                throw r4
            L1f:
                int r4 = r4.arg1     // Catch: java.lang.Throwable -> L2d java.lang.Error -> L2f java.lang.RuntimeException -> L42
                r3.m13839a(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Error -> L2f java.lang.RuntimeException -> L42
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
                goto L51
            L2a:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
                throw r4
            L2d:
                r4 = move-exception
                goto L55
            L2f:
                r4 = move-exception
                java.lang.String r0 = "DummySurface"
                java.lang.String r2 = "Failed to initialize dummy surface"
                p371v5.C6565o.m13369b(r0, r2, r4)     // Catch: java.lang.Throwable -> L2d
                r3.f26419a0 = r4     // Catch: java.lang.Throwable -> L2d
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L3f
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
                goto L51
            L3f:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
                throw r4
            L42:
                r4 = move-exception
                java.lang.String r0 = "DummySurface"
                java.lang.String r2 = "Failed to initialize dummy surface"
                p371v5.C6565o.m13369b(r0, r2, r4)     // Catch: java.lang.Throwable -> L2d
                r3.f26420b0 = r4     // Catch: java.lang.Throwable -> L2d
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L52
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            L51:
                return r1
            L52:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
                throw r4
            L55:
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L5b
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
                throw r4
            L5b:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
                throw r4
        }
    }

    public C6801d(p387w5.C6801d.b r1, android.graphics.SurfaceTexture r2, boolean r3, p387w5.C6801d.a r4) {
            r0 = this;
            r0.<init>(r2)
            r0.f26415Z = r1
            r0.f26414Y = r3
            return
    }

    /* renamed from: a */
    public static int m13836a(android.content.Context r7) {
            int r0 = p371v5.C6552b0.f25624a
            r1 = 24
            r2 = 12373(0x3055, float:1.7338E-41)
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Lb
            goto L47
        Lb:
            r1 = 26
            if (r0 >= r1) goto L24
            java.lang.String r5 = p371v5.C6552b0.f25626c
            java.lang.String r6 = "samsung"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L47
            java.lang.String r5 = p371v5.C6552b0.f25627d
            java.lang.String r6 = "XT1650"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L24
            goto L47
        L24:
            if (r0 >= r1) goto L33
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r1)
            if (r7 != 0) goto L33
            goto L47
        L33:
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetDisplay(r4)
            java.lang.String r7 = android.opengl.EGL14.eglQueryString(r7, r2)
            if (r7 == 0) goto L47
            java.lang.String r1 = "EGL_EXT_protected_content"
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L47
            r7 = 1
            goto L48
        L47:
            r7 = 0
        L48:
            if (r7 == 0) goto L67
            r7 = 17
            if (r0 >= r7) goto L4f
            goto L62
        L4f:
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetDisplay(r4)
            java.lang.String r7 = android.opengl.EGL14.eglQueryString(r7, r2)
            if (r7 == 0) goto L62
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L62
            r4 = 1
        L62:
            if (r4 == 0) goto L65
            return r3
        L65:
            r7 = 2
            return r7
        L67:
            return r4
    }

    /* renamed from: b */
    public static synchronized boolean m13837b(android.content.Context r3) {
            java.lang.Class<w5.d> r0 = p387w5.C6801d.class
            monitor-enter(r0)
            boolean r1 = p387w5.C6801d.f26413c0     // Catch: java.lang.Throwable -> L18
            r2 = 1
            if (r1 != 0) goto L10
            int r3 = m13836a(r3)     // Catch: java.lang.Throwable -> L18
            p387w5.C6801d.f26412b0 = r3     // Catch: java.lang.Throwable -> L18
            p387w5.C6801d.f26413c0 = r2     // Catch: java.lang.Throwable -> L18
        L10:
            int r3 = p387w5.C6801d.f26412b0     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L15
            goto L16
        L15:
            r2 = 0
        L16:
            monitor-exit(r0)
            return r2
        L18:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* renamed from: c */
    public static p387w5.C6801d m13838c(android.content.Context r4, boolean r5) {
            r0 = 0
            r1 = 1
            if (r5 == 0) goto Ld
            boolean r4 = m13837b(r4)
            if (r4 == 0) goto Lb
            goto Ld
        Lb:
            r4 = 0
            goto Le
        Ld:
            r4 = 1
        Le:
            p371v5.C6549a.m13291e(r4)
            w5.d$b r4 = new w5.d$b
            r4.<init>()
            if (r5 == 0) goto L1b
            int r5 = p387w5.C6801d.f26412b0
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r4.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = r4.getLooper()
            r2.<init>(r3, r4)
            r4.f26418Z = r2
            v5.j r3 = new v5.j
            r3.<init>(r2)
            r4.f26417Y = r3
            monitor-enter(r4)
            android.os.Handler r2 = r4.f26418Z     // Catch: java.lang.Throwable -> L67
            android.os.Message r5 = r2.obtainMessage(r1, r5, r0)     // Catch: java.lang.Throwable -> L67
            r5.sendToTarget()     // Catch: java.lang.Throwable -> L67
        L3b:
            w5.d r5 = r4.f26421c0     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L4d
            java.lang.RuntimeException r5 = r4.f26420b0     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L4d
            java.lang.Error r5 = r4.f26419a0     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L4d
            r4.wait()     // Catch: java.lang.InterruptedException -> L4b java.lang.Throwable -> L67
            goto L3b
        L4b:
            r0 = 1
            goto L3b
        L4d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L57
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L57:
            java.lang.RuntimeException r5 = r4.f26420b0
            if (r5 != 0) goto L66
            java.lang.Error r5 = r4.f26419a0
            if (r5 != 0) goto L65
            w5.d r4 = r4.f26421c0
            java.util.Objects.requireNonNull(r4)
            return r4
        L65:
            throw r5
        L66:
            throw r5
        L67:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            throw r5
    }

    @Override // android.view.Surface
    public void release() {
            r3 = this;
            super.release()
            w5.d$b r0 = r3.f26415Z
            monitor-enter(r0)
            boolean r1 = r3.f26416a0     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1a
            w5.d$b r1 = r3.f26415Z     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r2 = r1.f26418Z     // Catch: java.lang.Throwable -> L1c
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r1 = r1.f26418Z     // Catch: java.lang.Throwable -> L1c
            r2 = 2
            r1.sendEmptyMessage(r2)     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            r3.f26416a0 = r1     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }
}
