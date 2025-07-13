package p128hb;

/* renamed from: hb.f */
/* loaded from: classes.dex */
public class C3001f {

    /* renamed from: e */
    public static final /* synthetic */ int f12109e = 0;

    /* renamed from: a */
    public final java.util.Set<p353u6.InterfaceC6339b<java.lang.String, p128hb.C2999d>> f12110a;

    /* renamed from: b */
    public final java.util.concurrent.Executor f12111b;

    /* renamed from: c */
    public final p128hb.C2998c f12112c;

    /* renamed from: d */
    public final p128hb.C2998c f12113d;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset.forName(r0)
            java.lang.String r0 = "^(1|true|t|yes|y|on)$"
            r1 = 2
            java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r0 = "^(0|false|f|no|n|off|)$"
            java.util.regex.Pattern.compile(r0, r1)
            return
    }

    public C3001f(java.util.concurrent.Executor r2, p128hb.C2998c r3, p128hb.C2998c r4) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f12110a = r0
            r1.f12111b = r2
            r1.f12112c = r3
            r1.f12113d = r4
            return
    }

    /* renamed from: a */
    public static p128hb.C2999d m7374a(p128hb.C2998c r3) {
            monitor-enter(r3)
            s7.i<hb.d> r0 = r3.f12097c     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L15
            boolean r0 = r0.mo12455m()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L15
            s7.i<hb.d> r0 = r3.f12097c     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = r0.mo12451i()     // Catch: java.lang.Throwable -> L34
            hb.d r0 = (p128hb.C2999d) r0     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            goto L33
        L15:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            s7.i r3 = r3.m7370b()     // Catch: java.util.concurrent.TimeoutException -> L26 java.util.concurrent.ExecutionException -> L28 java.lang.InterruptedException -> L2a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L26 java.util.concurrent.ExecutionException -> L28 java.lang.InterruptedException -> L2a
            r1 = 5
            java.lang.Object r3 = p128hb.C2998c.m7369a(r3, r1, r0)     // Catch: java.util.concurrent.TimeoutException -> L26 java.util.concurrent.ExecutionException -> L28 java.lang.InterruptedException -> L2a
            r0 = r3
            hb.d r0 = (p128hb.C2999d) r0     // Catch: java.util.concurrent.TimeoutException -> L26 java.util.concurrent.ExecutionException -> L28 java.lang.InterruptedException -> L2a
            goto L33
        L26:
            r3 = move-exception
            goto L2b
        L28:
            r3 = move-exception
            goto L2b
        L2a:
            r3 = move-exception
        L2b:
            java.lang.String r0 = "FirebaseRemoteConfig"
            java.lang.String r1 = "Reading from storage file failed."
            android.util.Log.d(r0, r1, r3)
            r0 = 0
        L33:
            return r0
        L34:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r0
    }
}
