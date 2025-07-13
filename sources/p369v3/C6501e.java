package p369v3;

/* renamed from: v3.e */
/* loaded from: classes.dex */
public final class C6501e implements qa.InterfaceC5608e<p369v3.AbstractC6513q> {

    /* renamed from: a */
    public static final p369v3.C6501e f25197a = null;

    /* renamed from: b */
    public static final qa.C5607d f25198b = null;

    /* renamed from: c */
    public static final qa.C5607d f25199c = null;

    /* renamed from: d */
    public static final qa.C5607d f25200d = null;

    /* renamed from: e */
    public static final qa.C5607d f25201e = null;

    /* renamed from: f */
    public static final qa.C5607d f25202f = null;

    /* renamed from: g */
    public static final qa.C5607d f25203g = null;

    /* renamed from: h */
    public static final qa.C5607d f25204h = null;

    static {
            v3.e r0 = new v3.e
            r0.<init>()
            p369v3.C6501e.f25197a = r0
            java.lang.String r0 = "eventTimeMs"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6501e.f25198b = r0
            java.lang.String r0 = "eventCode"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6501e.f25199c = r0
            java.lang.String r0 = "eventUptimeMs"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6501e.f25200d = r0
            java.lang.String r0 = "sourceExtension"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6501e.f25201e = r0
            java.lang.String r0 = "sourceExtensionJsonProto3"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6501e.f25202f = r0
            java.lang.String r0 = "timezoneOffsetSeconds"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6501e.f25203g = r0
            java.lang.String r0 = "networkConnectionInfo"
            qa.d r0 = qa.C5607d.m11888a(r0)
            p369v3.C6501e.f25204h = r0
            return
    }

    public C6501e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // qa.InterfaceC5605b
    /* renamed from: a */
    public void mo5556a(java.lang.Object r4, qa.InterfaceC5609f r5) {
            r3 = this;
            v3.q r4 = (p369v3.AbstractC6513q) r4
            qa.f r5 = (qa.InterfaceC5609f) r5
            qa.d r0 = p369v3.C6501e.f25198b
            long r1 = r4.mo13224b()
            r5.mo7559d(r0, r1)
            qa.d r0 = p369v3.C6501e.f25199c
            java.lang.Integer r1 = r4.mo13223a()
            r5.mo7558c(r0, r1)
            qa.d r0 = p369v3.C6501e.f25200d
            long r1 = r4.mo13225c()
            r5.mo7559d(r0, r1)
            qa.d r0 = p369v3.C6501e.f25201e
            byte[] r1 = r4.mo13227e()
            r5.mo7558c(r0, r1)
            qa.d r0 = p369v3.C6501e.f25202f
            java.lang.String r1 = r4.mo13228f()
            r5.mo7558c(r0, r1)
            qa.d r0 = p369v3.C6501e.f25203g
            long r1 = r4.mo13229g()
            r5.mo7559d(r0, r1)
            qa.d r0 = p369v3.C6501e.f25204h
            v3.t r4 = r4.mo13226d()
            r5.mo7558c(r0, r4)
            return
    }
}
