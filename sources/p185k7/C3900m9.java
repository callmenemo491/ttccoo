package p185k7;

/* renamed from: k7.m9 */
/* loaded from: classes.dex */
public final class C3900m9 implements p185k7.InterfaceC3887l9 {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16750a = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.config.fix_feature_flags_from_config"
            r2 = 1
            k7.o4 r0 = r0.m8817b(r1, r2)
            p185k7.C3900m9.f16750a = r0
            return
    }

    public C3900m9() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3887l9
    /* renamed from: a */
    public final boolean mo8794a() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3900m9.f16750a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
