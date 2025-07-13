package p011aa;

/* renamed from: aa.c */
/* loaded from: classes.dex */
public class C0047c {

    /* renamed from: a */
    public static final p011aa.C0047c f101a = null;

    static {
            aa.c r0 = new aa.c
            java.lang.String r1 = "FirebaseCrashlytics"
            r0.<init>(r1)
            p011aa.C0047c.f101a = r0
            return
    }

    public C0047c(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final boolean m50a(int r2) {
            r1 = this;
            r0 = 4
            if (r0 <= r2) goto Le
            java.lang.String r0 = "FirebaseCrashlytics"
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto Lc
            goto Le
        Lc:
            r2 = 0
            goto Lf
        Le:
            r2 = 1
        Lf:
            return r2
    }

    /* renamed from: b */
    public void m51b(java.lang.String r3) {
            r2 = this;
            r0 = 3
            boolean r0 = r2.m50a(r0)
            if (r0 == 0) goto Ld
            r0 = 0
            java.lang.String r1 = "FirebaseCrashlytics"
            android.util.Log.d(r1, r3, r0)
        Ld:
            return
    }

    /* renamed from: c */
    public void m52c(java.lang.String r3) {
            r2 = this;
            r0 = 6
            boolean r0 = r2.m50a(r0)
            if (r0 == 0) goto Ld
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 0
            android.util.Log.e(r0, r3, r1)
        Ld:
            return
    }

    /* renamed from: d */
    public void m53d(java.lang.String r3) {
            r2 = this;
            r0 = 2
            boolean r0 = r2.m50a(r0)
            if (r0 == 0) goto Ld
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 0
            android.util.Log.v(r0, r3, r1)
        Ld:
            return
    }

    /* renamed from: e */
    public void m54e(java.lang.String r3) {
            r2 = this;
            r0 = 5
            boolean r0 = r2.m50a(r0)
            if (r0 == 0) goto Ld
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 0
            android.util.Log.w(r0, r3, r1)
        Ld:
            return
    }

    /* renamed from: f */
    public void m55f(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 5
            boolean r0 = r1.m50a(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "FirebaseCrashlytics"
            android.util.Log.w(r0, r2, r3)
        Lc:
            return
    }
}
