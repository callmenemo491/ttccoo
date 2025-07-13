package p057db;

/* renamed from: db.l0 */
/* loaded from: classes.dex */
public class BinderC1410l0 extends android.os.Binder {

    /* renamed from: a */
    public final p057db.BinderC1410l0.a f7071a;

    /* renamed from: db.l0$a */
    public interface a {
    }

    public BinderC1410l0(p057db.BinderC1410l0.a r1) {
            r0 = this;
            r0.<init>()
            r0.f7071a = r1
            return
    }

    /* renamed from: a */
    public void m3934a(p057db.ServiceConnectionC1412m0.a r6) {
            r5 = this;
            int r0 = android.os.Binder.getCallingUid()
            int r1 = android.os.Process.myUid()
            if (r0 != r1) goto L4b
            r0 = 3
            java.lang.String r1 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L18
            java.lang.String r0 = "service received new intent via bind strategy"
            android.util.Log.d(r1, r0)
        L18:
            db.l0$a r0 = r5.f7071a
            android.content.Intent r1 = r6.f7079a
            db.f$a r0 = (p057db.AbstractServiceC1397f.a) r0
            db.f r0 = r0.f7029a
            java.util.Objects.requireNonNull(r0)
            s7.j r2 = new s7.j
            r2.<init>()
            java.util.concurrent.ExecutorService r3 = r0.f7024Y
            c6.h0 r4 = new c6.h0
            r4.<init>(r0, r1, r2)
            r3.execute(r4)
            s7.q<TResult> r0 = r2.f23075a
            java.util.concurrent.Executor r1 = p057db.ExecutorC1406j0.f7064Y
            db.k0 r2 = new db.k0
            r2.<init>(r6)
            z2.n r6 = r0.f23097b
            s7.n r3 = new s7.n
            int r4 = p327s7.C5994r.f23102a
            r3.<init>(r1, r2)
            r6.m14310g(r3)
            r0.m12476u()
            return
        L4b:
            java.lang.SecurityException r6 = new java.lang.SecurityException
            java.lang.String r0 = "Binding only allowed within app"
            r6.<init>(r0)
            throw r6
    }
}
