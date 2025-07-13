package p075ea;

/* renamed from: ea.b */
/* loaded from: classes.dex */
public class C1808b {

    /* renamed from: d */
    public static final p075ea.C1808b.c f7855d = null;

    /* renamed from: a */
    public final android.content.Context f7856a;

    /* renamed from: b */
    public final p075ea.C1808b.b f7857b;

    /* renamed from: c */
    public p075ea.InterfaceC1807a f7858c;

    /* renamed from: ea.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: ea.b$b */
    public interface b {
    }

    /* renamed from: ea.b$c */
    public static final class c implements p075ea.InterfaceC1807a {
        public c(p075ea.C1808b.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p075ea.InterfaceC1807a
        /* renamed from: a */
        public void mo4545a() {
                r0 = this;
                return
        }

        @Override // p075ea.InterfaceC1807a
        /* renamed from: b */
        public java.lang.String mo4546b() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // p075ea.InterfaceC1807a
        /* renamed from: c */
        public void mo4547c(long r1, java.lang.String r3) {
                r0 = this;
                return
        }
    }

    static {
            ea.b$c r0 = new ea.b$c
            r1 = 0
            r0.<init>(r1)
            p075ea.C1808b.f7855d = r0
            return
    }

    public C1808b(android.content.Context r1, p075ea.C1808b.b r2) {
            r0 = this;
            r0.<init>()
            r0.f7856a = r1
            r0.f7857b = r2
            ea.b$c r1 = p075ea.C1808b.f7855d
            r0.f7858c = r1
            r1 = 0
            r0.m4548a(r1)
            return
    }

    public C1808b(android.content.Context r1, p075ea.C1808b.b r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f7856a = r1
            r0.f7857b = r2
            ea.b$c r1 = p075ea.C1808b.f7855d
            r0.f7858c = r1
            r0.m4548a(r3)
            return
    }

    /* renamed from: a */
    public final void m4548a(java.lang.String r5) {
            r4 = this;
            ea.a r0 = r4.f7858c
            r0.mo4545a()
            ea.b$c r0 = p075ea.C1808b.f7855d
            r4.f7858c = r0
            if (r5 != 0) goto Lc
            return
        Lc:
            android.content.Context r0 = r4.f7856a
            java.lang.String r1 = "com.crashlytics.CollectCustomLogs"
            r2 = 1
            boolean r0 = p056da.C1354e.m3860d(r0, r1, r2)
            if (r0 != 0) goto L27
            r5 = 3
            java.lang.String r0 = "FirebaseCrashlytics"
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto L26
            r5 = 0
            java.lang.String r1 = "Preferences requested no custom logs. Aborting log file creation."
            android.util.Log.d(r0, r1, r5)
        L26:
            return
        L27:
            java.lang.String r0 = "crashlytics-userlog-"
            java.lang.String r1 = ".temp"
            java.lang.String r5 = android.support.v4.media.C0145d.m257a(r0, r5, r1)
            java.io.File r0 = new java.io.File
            ea.b$b r1 = r4.f7857b
            da.y$b r1 = (p056da.C1385y.b) r1
            java.util.Objects.requireNonNull(r1)
            java.io.File r2 = new java.io.File
            k7.h4 r1 = r1.f6994a
            java.io.File r1 = r1.m8568b()
            java.lang.String r3 = "log-files"
            r2.<init>(r1, r3)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L4e
            r2.mkdirs()
        L4e:
            r0.<init>(r2, r5)
            r5 = 65536(0x10000, float:9.1835E-41)
            ea.d r1 = new ea.d
            r1.<init>(r0, r5)
            r4.f7858c = r1
            return
    }
}
