package p185k7;

/* renamed from: k7.r8 */
/* loaded from: classes.dex */
public final class C3964r8 implements p185k7.InterfaceC3951q8 {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16852a = null;

    /* renamed from: b */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16853b = null;

    /* renamed from: c */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16854c = null;

    static {
            java.lang.String r0 = "com.google.android.gms.measurement"
            android.net.Uri r0 = p185k7.C3813g4.m8551a(r0)
            k7.m4 r1 = new k7.m4
            r2 = 0
            r3 = 1
            r1.<init>(r2, r0, r3)
            java.lang.String r0 = "measurement.adid_zero.service"
            r2 = 0
            k7.o4 r0 = r1.m8817b(r0, r2)
            p185k7.C3964r8.f16852a = r0
            java.lang.String r0 = "measurement.adid_zero.adid_uid"
            k7.o4 r0 = r1.m8817b(r0, r2)
            p185k7.C3964r8.f16853b = r0
            java.lang.String r0 = "measurement.adid_zero.remove_lair_if_adidzero_false"
            k7.o4 r0 = r1.m8817b(r0, r3)
            p185k7.C3964r8.f16854c = r0
            return
    }

    public C3964r8() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3951q8
    /* renamed from: a */
    public final boolean mo8910a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p185k7.InterfaceC3951q8
    /* renamed from: b */
    public final boolean mo8911b() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3964r8.f16852a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // p185k7.InterfaceC3951q8
    /* renamed from: c */
    public final boolean mo8912c() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3964r8.f16853b
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // p185k7.InterfaceC3951q8
    /* renamed from: f */
    public final boolean mo8913f() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3964r8.f16854c
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
