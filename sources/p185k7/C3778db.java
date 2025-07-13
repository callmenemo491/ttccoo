package p185k7;

/* renamed from: k7.db */
/* loaded from: classes.dex */
public final class C3778db implements p185k7.InterfaceC3764cb {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16601a = null;

    /* renamed from: b */
    public static final p185k7.AbstractC3921o4<java.lang.Double> f16602b = null;

    /* renamed from: c */
    public static final p185k7.AbstractC3921o4<java.lang.Long> f16603c = null;

    /* renamed from: d */
    public static final p185k7.AbstractC3921o4<java.lang.Long> f16604d = null;

    /* renamed from: e */
    public static final p185k7.AbstractC3921o4<java.lang.String> f16605e = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.test.boolean_flag"
            r2 = 0
            k7.o4 r1 = r0.m8817b(r1, r2)
            p185k7.C3778db.f16601a = r1
            r1 = -4609434218613702656(0xc008000000000000, double:-3.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            k7.k4 r2 = new k7.k4
            r2.<init>(r0, r1)
            p185k7.C3778db.f16602b = r2
            r1 = -2
            java.lang.String r3 = "measurement.test.int_flag"
            k7.o4 r1 = r0.m8816a(r3, r1)
            p185k7.C3778db.f16603c = r1
            r1 = -1
            java.lang.String r3 = "measurement.test.long_flag"
            k7.o4 r1 = r0.m8816a(r3, r1)
            p185k7.C3778db.f16604d = r1
            k7.l4 r1 = new k7.l4
            java.lang.String r2 = "measurement.test.string_flag"
            java.lang.String r3 = "---"
            r1.<init>(r0, r2, r3)
            p185k7.C3778db.f16605e = r1
            return
    }

    public C3778db() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3764cb
    /* renamed from: a */
    public final double mo8344a() {
            r2 = this;
            k7.o4<java.lang.Double> r0 = p185k7.C3778db.f16602b
            java.lang.Object r0 = r0.m8860b()
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    @Override // p185k7.InterfaceC3764cb
    /* renamed from: b */
    public final long mo8345b() {
            r2 = this;
            k7.o4<java.lang.Long> r0 = p185k7.C3778db.f16603c
            java.lang.Object r0 = r0.m8860b()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    @Override // p185k7.InterfaceC3764cb
    /* renamed from: c */
    public final long mo8346c() {
            r2 = this;
            k7.o4<java.lang.Long> r0 = p185k7.C3778db.f16604d
            java.lang.Object r0 = r0.m8860b()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    @Override // p185k7.InterfaceC3764cb
    /* renamed from: d */
    public final boolean mo8347d() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3778db.f16601a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // p185k7.InterfaceC3764cb
    /* renamed from: f */
    public final java.lang.String mo8348f() {
            r1 = this;
            k7.o4<java.lang.String> r0 = p185k7.C3778db.f16605e
            java.lang.Object r0 = r0.m8860b()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }
}
