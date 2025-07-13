package p185k7;

/* renamed from: k7.na */
/* loaded from: classes.dex */
public final class C3914na implements p185k7.InterfaceC3901ma {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16778a = null;

    /* renamed from: b */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16779b = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.sdk.collection.enable_extend_user_property_size"
            r2 = 1
            k7.o4 r1 = r0.m8817b(r1, r2)
            p185k7.C3914na.f16778a = r1
            java.lang.String r1 = "measurement.sdk.collection.last_deep_link_referrer2"
            r0.m8817b(r1, r2)
            java.lang.String r1 = "measurement.sdk.collection.last_deep_link_referrer_campaign2"
            r2 = 0
            k7.o4 r1 = r0.m8817b(r1, r2)
            p185k7.C3914na.f16779b = r1
            java.lang.String r1 = "measurement.id.sdk.collection.last_deep_link_referrer2"
            r2 = 0
            r0.m8816a(r1, r2)
            return
    }

    public C3914na() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3901ma
    /* renamed from: a */
    public final boolean mo8834a() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3914na.f16778a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // p185k7.InterfaceC3901ma
    /* renamed from: b */
    public final boolean mo8835b() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3914na.f16779b
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
