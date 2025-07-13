package p056da;

/* renamed from: da.k */
/* loaded from: classes.dex */
public class CallableC1366k implements java.util.concurrent.Callable<java.lang.Void> {

    /* renamed from: a */
    public final /* synthetic */ long f6922a;

    /* renamed from: b */
    public final /* synthetic */ p056da.C1378r f6923b;

    public CallableC1366k(p056da.C1378r r1, long r2) {
            r0 = this;
            r0.f6923b = r1
            r0.f6922a = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Void call() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = 1
            java.lang.String r2 = "fatal"
            r0.putInt(r2, r1)
            long r1 = r4.f6922a
            java.lang.String r3 = "timestamp"
            r0.putLong(r3, r1)
            da.r r1 = r4.f6923b
            ba.a r1 = r1.f6960l
            java.lang.String r2 = "_ae"
            r1.mo2333e(r2, r0)
            r0 = 0
            return r0
    }
}
