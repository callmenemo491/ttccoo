package p452z9;

/* renamed from: z9.e */
/* loaded from: classes.dex */
public class CallableC7263e implements java.util.concurrent.Callable<java.lang.Void> {

    /* renamed from: a */
    public final /* synthetic */ boolean f27870a;

    /* renamed from: b */
    public final /* synthetic */ p056da.C1385y f27871b;

    /* renamed from: c */
    public final /* synthetic */ p188ka.C4075b f27872c;

    public CallableC7263e(boolean r1, p056da.C1385y r2, p188ka.C4075b r3) {
            r0 = this;
            r0.f27870a = r1
            r0.f27871b = r2
            r0.f27872c = r3
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Void call() {
            r4 = this;
            boolean r0 = r4.f27870a
            if (r0 == 0) goto L1e
            da.y r0 = r4.f27871b
            ka.b r1 = r4.f27872c
            java.util.concurrent.ExecutorService r2 = r0.f6990j
            da.w r3 = new da.w
            r3.<init>(r0, r1)
            java.util.concurrent.ExecutorService r0 = p056da.C1375o0.f6943a
            s7.j r0 = new s7.j
            r0.<init>()
            da.n0 r1 = new da.n0
            r1.<init>(r3, r0)
            r2.execute(r1)
        L1e:
            r0 = 0
            return r0
    }
}
