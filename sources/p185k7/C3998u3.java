package p185k7;

/* renamed from: k7.u3 */
/* loaded from: classes.dex */
public final class C3998u3 {

    /* renamed from: a */
    public static final android.net.Uri f16878a = null;

    /* renamed from: b */
    public static final java.util.regex.Pattern f16879b = null;

    /* renamed from: c */
    public static final java.util.regex.Pattern f16880c = null;

    /* renamed from: d */
    public static final java.util.concurrent.atomic.AtomicBoolean f16881d = null;

    /* renamed from: e */
    public static java.util.HashMap<java.lang.String, java.lang.String> f16882e;

    /* renamed from: f */
    public static final java.util.HashMap<java.lang.String, java.lang.Boolean> f16883f = null;

    /* renamed from: g */
    public static final java.util.HashMap<java.lang.String, java.lang.Integer> f16884g = null;

    /* renamed from: h */
    public static final java.util.HashMap<java.lang.String, java.lang.Long> f16885h = null;

    /* renamed from: i */
    public static final java.util.HashMap<java.lang.String, java.lang.Float> f16886i = null;

    /* renamed from: j */
    public static java.lang.Object f16887j;

    /* renamed from: k */
    public static final java.lang.String[] f16888k = null;

    static {
            java.lang.String r0 = "content://com.google.android.gsf.gservices"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            p185k7.C3998u3.f16878a = r0
            java.lang.String r0 = "content://com.google.android.gsf.gservices/prefix"
            android.net.Uri.parse(r0)
            java.lang.String r0 = "^(1|true|t|on|yes|y)$"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            p185k7.C3998u3.f16879b = r0
            java.lang.String r0 = "^(0|false|f|off|no|n)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            p185k7.C3998u3.f16880c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            p185k7.C3998u3.f16881d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p185k7.C3998u3.f16883f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p185k7.C3998u3.f16884g = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p185k7.C3998u3.f16885h = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p185k7.C3998u3.f16886i = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            p185k7.C3998u3.f16888k = r0
            return
    }

    public C3998u3() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static void m9053a(java.lang.Object r2, java.lang.String r3, java.lang.String r4) {
            java.lang.Class<k7.u3> r0 = p185k7.C3998u3.class
            monitor-enter(r0)
            java.lang.Object r1 = p185k7.C3998u3.f16887j     // Catch: java.lang.Throwable -> Le
            if (r2 != r1) goto Lc
            java.util.HashMap<java.lang.String, java.lang.String> r2 = p185k7.C3998u3.f16882e     // Catch: java.lang.Throwable -> Le
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }
}
