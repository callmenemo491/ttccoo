package p056da;

/* renamed from: da.s */
/* loaded from: classes.dex */
public class CallableC1379s implements java.util.concurrent.Callable<java.lang.Void> {

    /* renamed from: a */
    public final /* synthetic */ long f6968a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.String f6969b;

    /* renamed from: c */
    public final /* synthetic */ p056da.C1378r f6970c;

    public CallableC1379s(p056da.C1378r r1, long r2, java.lang.String r4) {
            r0 = this;
            r0.f6970c = r1
            r0.f6968a = r2
            r0.f6969b = r4
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Void call() {
            r4 = this;
            da.r r0 = r4.f6970c
            boolean r0 = r0.m3901h()
            if (r0 != 0) goto L15
            da.r r0 = r4.f6970c
            ea.b r0 = r0.f6957i
            long r1 = r4.f6968a
            java.lang.String r3 = r4.f6969b
            ea.a r0 = r0.f7858c
            r0.mo4547c(r1, r3)
        L15:
            r0 = 0
            return r0
    }
}
