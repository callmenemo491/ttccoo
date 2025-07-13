package p185k7;

/* renamed from: k7.ea */
/* loaded from: classes.dex */
public final class C3791ea implements p185k7.InterfaceC3777da {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16618a = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.collection.efficient_engagement_reporting_enabled_2"
            r2 = 1
            r0.m8817b(r1, r2)
            java.lang.String r1 = "measurement.collection.redundant_engagement_removal_enabled"
            r2 = 0
            k7.o4 r1 = r0.m8817b(r1, r2)
            p185k7.C3791ea.f16618a = r1
            java.lang.String r1 = "measurement.id.collection.redundant_engagement_removal_enabled"
            r2 = 0
            r0.m8816a(r1, r2)
            return
    }

    public C3791ea() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3777da
    /* renamed from: a */
    public final boolean mo8506a() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3791ea.f16618a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
