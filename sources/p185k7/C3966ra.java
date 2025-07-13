package p185k7;

/* renamed from: k7.ra */
/* loaded from: classes.dex */
public final class C3966ra implements p185k7.InterfaceC3953qa {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16855a = null;

    /* renamed from: b */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16856b = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.id.lifecycle.app_in_background_parameter"
            r2 = 0
            r0.m8816a(r1, r2)
            java.lang.String r1 = "measurement.lifecycle.app_backgrounded_engagement"
            r4 = 0
            k7.o4 r1 = r0.m8817b(r1, r4)
            p185k7.C3966ra.f16855a = r1
            java.lang.String r1 = "measurement.lifecycle.app_backgrounded_tracking"
            r5 = 1
            r0.m8817b(r1, r5)
            java.lang.String r1 = "measurement.lifecycle.app_in_background_parameter"
            k7.o4 r1 = r0.m8817b(r1, r4)
            p185k7.C3966ra.f16856b = r1
            java.lang.String r1 = "measurement.id.lifecycle.app_backgrounded_tracking"
            r0.m8816a(r1, r2)
            return
    }

    public C3966ra() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3953qa
    /* renamed from: a */
    public final boolean mo8916a() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3966ra.f16855a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // p185k7.InterfaceC3953qa
    /* renamed from: b */
    public final boolean mo8917b() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3966ra.f16856b
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
