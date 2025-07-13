package p369v3;

/* renamed from: v3.f */
/* loaded from: classes.dex */
public final class C6502f implements qa.InterfaceC5608e<p369v3.AbstractC6514r> {

    /* renamed from: a */
    public static final p369v3.C6502f f25205a = null;

    /* renamed from: b */
    public static final qa.C5607d f25206b = null;

    /* renamed from: c */
    public static final qa.C5607d f25207c = null;

    /* renamed from: d */
    public static final qa.C5607d f25208d = null;

    /* renamed from: e */
    public static final qa.C5607d f25209e = null;

    /* renamed from: f */
    public static final qa.C5607d f25210f = null;

    /* renamed from: g */
    public static final qa.C5607d f25211g = null;

    /* renamed from: h */
    public static final qa.C5607d f25212h = null;

    static {
            v3.f r0 = new v3.f
            r0.<init>()
            p369v3.C6502f.f25205a = r0
            java.lang.String r0 = "requestTimeMs"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6502f.f25206b = r0
            java.lang.String r0 = "requestUptimeMs"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6502f.f25207c = r0
            java.lang.String r0 = "clientInfo"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6502f.f25208d = r0
            java.lang.String r0 = "logSource"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6502f.f25209e = r0
            java.lang.String r0 = "logSourceName"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6502f.f25210f = r0
            java.lang.String r0 = "logEvent"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6502f.f25211g = r0
            java.lang.String r0 = "qosTier"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6502f.f25212h = r0
            return
    }

    public C6502f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // qa.InterfaceC5605b
    /* renamed from: a */
    public void mo5556a(java.lang.Object r4, qa.InterfaceC5609f r5) {
            r3 = this;
            v3.r r4 = (p369v3.AbstractC6514r) r4
            qa.f r5 = (qa.InterfaceC5609f) r5
            qa.d r0 = p369v3.C6502f.f25206b
            long r1 = r4.mo13235f()
            r5.mo7559d(r0, r1)
            qa.d r0 = p369v3.C6502f.f25207c
            long r1 = r4.mo13236g()
            r5.mo7559d(r0, r1)
            qa.d r0 = p369v3.C6502f.f25208d
            v3.p r1 = r4.mo13230a()
            r5.mo7558c(r0, r1)
            qa.d r0 = p369v3.C6502f.f25209e
            java.lang.Integer r1 = r4.mo13232c()
            r5.mo7558c(r0, r1)
            qa.d r0 = p369v3.C6502f.f25210f
            java.lang.String r1 = r4.mo13233d()
            r5.mo7558c(r0, r1)
            qa.d r0 = p369v3.C6502f.f25211g
            java.util.List r1 = r4.mo13231b()
            r5.mo7558c(r0, r1)
            qa.d r0 = p369v3.C6502f.f25212h
            v3.u r4 = r4.mo13234e()
            r5.mo7558c(r0, r4)
            return
    }
}
