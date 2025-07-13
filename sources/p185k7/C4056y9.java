package p185k7;

/* renamed from: k7.y9 */
/* loaded from: classes.dex */
public final class C4056y9 implements p185k7.InterfaceC4043x9 {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16973a = null;

    /* renamed from: b */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16974b = null;

    /* renamed from: c */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16975c = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.service.audience.fix_skip_audience_with_failed_filters"
            r2 = 1
            r0.m8817b(r1, r2)
            java.lang.String r1 = "measurement.audience.refresh_event_count_filters_timestamp"
            r2 = 0
            k7.o4 r1 = r0.m8817b(r1, r2)
            p185k7.C4056y9.f16973a = r1
            java.lang.String r1 = "measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters"
            k7.o4 r1 = r0.m8817b(r1, r2)
            p185k7.C4056y9.f16974b = r1
            java.lang.String r1 = "measurement.audience.use_bundle_timestamp_for_event_count_filters"
            k7.o4 r0 = r0.m8817b(r1, r2)
            p185k7.C4056y9.f16975c = r0
            return
    }

    public C4056y9() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC4043x9
    /* renamed from: a */
    public final boolean mo9110a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p185k7.InterfaceC4043x9
    /* renamed from: b */
    public final boolean mo9111b() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C4056y9.f16973a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // p185k7.InterfaceC4043x9
    /* renamed from: c */
    public final boolean mo9112c() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C4056y9.f16974b
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // p185k7.InterfaceC4043x9
    /* renamed from: f */
    public final boolean mo9113f() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C4056y9.f16975c
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
