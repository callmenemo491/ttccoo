package p185k7;

/* renamed from: k7.u8 */
/* loaded from: classes.dex */
public final class C4003u8 implements p185k7.InterfaceC3990t8 {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16897a = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.androidId.delete_feature"
            r2 = 1
            k7.o4 r1 = r0.m8817b(r1, r2)
            p185k7.C4003u8.f16897a = r1
            java.lang.String r1 = "measurement.log_androidId_enabled"
            r2 = 0
            r0.m8817b(r1, r2)
            return
    }

    public C4003u8() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3990t8
    /* renamed from: a */
    public final boolean mo9016a() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C4003u8.f16897a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
