package p185k7;

/* renamed from: k7.v9 */
/* loaded from: classes.dex */
public final class C4017v9 implements p185k7.InterfaceC4004u9 {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16914a = null;

    /* renamed from: b */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16915b = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.client.consent.suppress_1p_in_ga4f_install"
            r2 = 1
            k7.o4 r1 = r0.m8817b(r1, r2)
            p185k7.C4017v9.f16914a = r1
            java.lang.String r1 = "measurement.client.consent.gmpappid_worker_thread_fix"
            k7.o4 r0 = r0.m8817b(r1, r2)
            p185k7.C4017v9.f16915b = r0
            return
    }

    public C4017v9() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC4004u9
    /* renamed from: a */
    public final boolean mo9062a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p185k7.InterfaceC4004u9
    /* renamed from: b */
    public final boolean mo9063b() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C4017v9.f16914a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // p185k7.InterfaceC4004u9
    /* renamed from: c */
    public final boolean mo9064c() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C4017v9.f16915b
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
