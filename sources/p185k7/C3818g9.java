package p185k7;

/* renamed from: k7.g9 */
/* loaded from: classes.dex */
public final class C3818g9 implements p185k7.InterfaceC3804f9 {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Long> f16651a = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.client.consent_state_v1"
            r2 = 1
            r0.m8817b(r1, r2)
            java.lang.String r1 = "measurement.client.3p_consent_state_v1"
            r0.m8817b(r1, r2)
            java.lang.String r1 = "measurement.service.consent_state_v1_W36"
            r0.m8817b(r1, r2)
            java.lang.String r1 = "measurement.service.storage_consent_support_version"
            r2 = 203600(0x31b50, double:1.00592E-318)
            k7.o4 r0 = r0.m8816a(r1, r2)
            p185k7.C3818g9.f16651a = r0
            return
    }

    public C3818g9() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3804f9
    /* renamed from: a */
    public final long mo8546a() {
            r2 = this;
            k7.o4<java.lang.Long> r0 = p185k7.C3818g9.f16651a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }
}
