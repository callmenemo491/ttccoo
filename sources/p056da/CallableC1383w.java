package p056da;

/* renamed from: da.w */
/* loaded from: classes.dex */
public class CallableC1383w implements java.util.concurrent.Callable<p327s7.AbstractC5985i<java.lang.Void>> {

    /* renamed from: a */
    public final /* synthetic */ p188ka.InterfaceC4076c f6977a;

    /* renamed from: b */
    public final /* synthetic */ p056da.C1385y f6978b;

    public CallableC1383w(p056da.C1385y r1, p188ka.InterfaceC4076c r2) {
            r0 = this;
            r0.f6978b = r1
            r0.f6977a = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public p327s7.AbstractC5985i<java.lang.Void> call() {
            r2 = this;
            da.y r0 = r2.f6978b
            ka.c r1 = r2.f6977a
            s7.i r0 = p056da.C1385y.m3903a(r0, r1)
            return r0
    }
}
