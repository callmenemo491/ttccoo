package p056da;

/* renamed from: da.h */
/* loaded from: classes.dex */
public class C1360h implements p327s7.InterfaceC5977a<java.lang.Void, java.lang.Object> {

    /* renamed from: Y */
    public final /* synthetic */ java.util.concurrent.Callable f6909Y;

    public C1360h(p056da.C1356f r1, java.util.concurrent.Callable r2) {
            r0 = this;
            r0.f6909Y = r2
            r0.<init>()
            return
    }

    @Override // p327s7.InterfaceC5977a
    /* renamed from: g */
    public java.lang.Object mo816g(p327s7.AbstractC5985i<java.lang.Void> r1) {
            r0 = this;
            java.util.concurrent.Callable r1 = r0.f6909Y
            java.lang.Object r1 = r1.call()
            return r1
    }
}
