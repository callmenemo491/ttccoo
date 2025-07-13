package p085f1;

/* renamed from: f1.e0 */
/* loaded from: classes.dex */
public class RunnableC1959e0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p085f1.ServiceConnectionC1961f0.a f8550Y;

    public RunnableC1959e0(p085f1.ServiceConnectionC1961f0.a r1) {
            r0 = this;
            r0.f8550Y = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            f1.f0$a r0 = r5.f8550Y
            android.util.SparseArray<f1.o$d> r1 = r0.f8569h
            int r1 = r1.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1a
            android.util.SparseArray<f1.o$d> r3 = r0.f8569h
            java.lang.Object r3 = r3.valueAt(r2)
            f1.o$d r3 = (p085f1.C1974o.d) r3
            r4 = 0
            r3.mo4900a(r4, r4)
            int r2 = r2 + 1
            goto L9
        L1a:
            android.util.SparseArray<f1.o$d> r0 = r0.f8569h
            r0.clear()
            return
    }
}
