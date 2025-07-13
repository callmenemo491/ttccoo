package p185k7;

/* renamed from: k7.ha */
/* loaded from: classes.dex */
public final class C3833ha implements p185k7.InterfaceC3819ga {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16663a = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.collection.firebase_global_collection_flag_enabled"
            r2 = 1
            k7.o4 r0 = r0.m8817b(r1, r2)
            p185k7.C3833ha.f16663a = r0
            return
    }

    public C3833ha() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3819ga
    /* renamed from: a */
    public final boolean mo8554a() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3833ha.f16663a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
