package ad;

/* renamed from: ad.a */
/* loaded from: classes.dex */
public final class C0058a {

    /* renamed from: g */
    public static final java.util.Collection<java.lang.String> f148g = null;

    /* renamed from: a */
    public boolean f149a;

    /* renamed from: b */
    public boolean f150b;

    /* renamed from: c */
    public final boolean f151c;

    /* renamed from: d */
    public final android.hardware.Camera f152d;

    /* renamed from: e */
    public android.os.Handler f153e;

    /* renamed from: f */
    public final android.hardware.Camera.AutoFocusCallback f154f;

    /* renamed from: ad.a$a */
    public class a implements android.os.Handler.Callback {

        /* renamed from: Y */
        public final /* synthetic */ ad.C0058a f155Y;

        public a(ad.C0058a r1) {
                r0 = this;
                r0.f155Y = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r2) {
                r1 = this;
                int r2 = r2.what
                ad.a r0 = r1.f155Y
                java.util.Objects.requireNonNull(r0)
                r0 = 1
                if (r2 != r0) goto L10
                ad.a r2 = r1.f155Y
                r2.m90b()
                return r0
            L10:
                r2 = 0
                return r2
        }
    }

    /* renamed from: ad.a$b */
    public class b implements android.hardware.Camera.AutoFocusCallback {

        /* renamed from: a */
        public final /* synthetic */ ad.C0058a f156a;

        public b(ad.C0058a r1) {
                r0 = this;
                r0.f156a = r1
                r0.<init>()
                return
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean r1, android.hardware.Camera r2) {
                r0 = this;
                ad.a r1 = r0.f156a
                android.os.Handler r1 = r1.f153e
                f1.f r2 = new f1.f
                r2.<init>(r0)
                r1.post(r2)
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            ad.C0058a.f148g = r0
            java.lang.String r1 = "auto"
            r0.add(r1)
            java.lang.String r1 = "macro"
            r0.add(r1)
            return
    }

    public C0058a(android.hardware.Camera r4, ad.C0063f r5) {
            r3 = this;
            r3.<init>()
            ad.a$a r0 = new ad.a$a
            r0.<init>(r3)
            ad.a$b r1 = new ad.a$b
            r1.<init>(r3)
            r3.f154f = r1
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            r3.f153e = r1
            r3.f152d = r4
            android.hardware.Camera$Parameters r4 = r4.getParameters()
            java.lang.String r4 = r4.getFocusMode()
            java.util.Objects.requireNonNull(r5)
            java.util.Collection<java.lang.String> r5 = ad.C0058a.f148g
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.contains(r4)
            r3.f151c = r5
            java.lang.String r0 = "a"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Current focus mode '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "'; use auto focus? "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            android.util.Log.i(r0, r4)
            r4 = 0
            r3.f149a = r4
            r3.m90b()
            return
    }

    /* renamed from: a */
    public final synchronized void m89a() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f149a     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
            android.os.Handler r0 = r4.f153e     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            boolean r0 = r0.hasMessages(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
            android.os.Handler r0 = r4.f153e     // Catch: java.lang.Throwable -> L1b
            android.os.Message r1 = r0.obtainMessage(r1)     // Catch: java.lang.Throwable -> L1b
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.sendMessageDelayed(r1, r2)     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r4)
            return
        L1b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    /* renamed from: b */
    public final void m90b() {
            r3 = this;
            boolean r0 = r3.f151c
            if (r0 == 0) goto L22
            boolean r0 = r3.f149a
            if (r0 != 0) goto L22
            boolean r0 = r3.f150b
            if (r0 != 0) goto L22
            android.hardware.Camera r0 = r3.f152d     // Catch: java.lang.RuntimeException -> L17
            android.hardware.Camera$AutoFocusCallback r1 = r3.f154f     // Catch: java.lang.RuntimeException -> L17
            r0.autoFocus(r1)     // Catch: java.lang.RuntimeException -> L17
            r0 = 1
            r3.f150b = r0     // Catch: java.lang.RuntimeException -> L17
            goto L22
        L17:
            r0 = move-exception
            java.lang.String r1 = "a"
            java.lang.String r2 = "Unexpected exception while focusing"
            android.util.Log.w(r1, r2, r0)
            r3.m89a()
        L22:
            return
    }

    /* renamed from: c */
    public void m91c() {
            r3 = this;
            r0 = 1
            r3.f149a = r0
            r1 = 0
            r3.f150b = r1
            android.os.Handler r1 = r3.f153e
            r1.removeMessages(r0)
            boolean r0 = r3.f151c
            if (r0 == 0) goto L1d
            android.hardware.Camera r0 = r3.f152d     // Catch: java.lang.RuntimeException -> L15
            r0.cancelAutoFocus()     // Catch: java.lang.RuntimeException -> L15
            goto L1d
        L15:
            r0 = move-exception
            java.lang.String r1 = "a"
            java.lang.String r2 = "Unexpected exception while cancelling focusing"
            android.util.Log.w(r1, r2, r0)
        L1d:
            return
    }
}
