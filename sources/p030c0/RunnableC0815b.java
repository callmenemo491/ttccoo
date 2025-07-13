package p030c0;

/* renamed from: c0.b */
/* loaded from: classes.dex */
public class RunnableC0815b implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ android.app.Activity f4425Y;

    public RunnableC0815b(android.app.Activity r1) {
            r0 = this;
            r0.f4425Y = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            android.app.Activity r0 = r1.f4425Y
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L15
            android.app.Activity r0 = r1.f4425Y
            boolean r0 = p030c0.C0817d.m2465b(r0)
            if (r0 != 0) goto L15
            android.app.Activity r0 = r1.f4425Y
            r0.recreate()
        L15:
            return
    }
}
