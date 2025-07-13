package p185k7;

/* renamed from: k7.mb */
/* loaded from: classes.dex */
public final class C3902mb implements p185k7.InterfaceC3889lb {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16751a = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.scheduler.task_thread.cleanup_on_exit"
            r2 = 0
            k7.o4 r0 = r0.m8817b(r1, r2)
            p185k7.C3902mb.f16751a = r0
            return
    }

    public C3902mb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3889lb
    /* renamed from: a */
    public final boolean mo8796a() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3902mb.f16751a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
