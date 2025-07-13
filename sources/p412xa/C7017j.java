package p412xa;

/* renamed from: xa.j */
/* loaded from: classes.dex */
public final class C7017j {

    /* renamed from: b */
    public static final long f27332b = 0;

    /* renamed from: c */
    public static final java.util.regex.Pattern f27333c = null;

    /* renamed from: d */
    public static p412xa.C7017j f27334d;

    /* renamed from: a */
    public final p214m2.C4339q f27335a;

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            r1 = 1
            long r0 = r0.toSeconds(r1)
            p412xa.C7017j.f27332b = r0
            java.lang.String r0 = "\\AA[\\w-]{38}\\z"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            p412xa.C7017j.f27333c = r0
            return
    }

    public C7017j(p214m2.C4339q r1) {
            r0 = this;
            r0.<init>()
            r0.f27335a = r1
            return
    }

    /* renamed from: c */
    public static p412xa.C7017j m14169c() {
            m2.q r0 = p214m2.C4339q.f17791Y
            if (r0 != 0) goto Ld
            m2.q r0 = new m2.q
            r1 = 23
            r0.<init>(r1)
            p214m2.C4339q.f17791Y = r0
        Ld:
            m2.q r0 = p214m2.C4339q.f17791Y
            xa.j r1 = p412xa.C7017j.f27334d
            if (r1 != 0) goto L1a
            xa.j r1 = new xa.j
            r1.<init>(r0)
            p412xa.C7017j.f27334d = r1
        L1a:
            xa.j r0 = p412xa.C7017j.f27334d
            return r0
    }

    /* renamed from: a */
    public long m14170a() {
            r2 = this;
            m2.q r0 = r2.f27335a
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    /* renamed from: b */
    public long m14171b() {
            r3 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r3.m14170a()
            long r0 = r0.toSeconds(r1)
            return r0
    }

    /* renamed from: d */
    public boolean m14172d(za.AbstractC7268d r9) {
            r8 = this;
            java.lang.String r0 = r9.mo14342a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            long r2 = r9.mo14348g()
            long r4 = r9.mo14343b()
            long r4 = r4 + r2
            long r2 = r8.m14171b()
            long r6 = p412xa.C7017j.f27332b
            long r2 = r2 + r6
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 >= 0) goto L21
            return r1
        L21:
            r9 = 0
            return r9
    }
}
