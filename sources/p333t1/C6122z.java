package p333t1;

/* renamed from: t1.z */
/* loaded from: classes.dex */
public class C6122z implements p333t1.InterfaceC6097a0 {

    /* renamed from: a */
    public final android.view.WindowId f23654a;

    public C6122z(android.view.View r1) {
            r0 = this;
            r0.<init>()
            android.view.WindowId r1 = r1.getWindowId()
            r0.f23654a = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p333t1.C6122z
            if (r0 == 0) goto L12
            t1.z r2 = (p333t1.C6122z) r2
            android.view.WindowId r2 = r2.f23654a
            android.view.WindowId r0 = r1.f23654a
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.view.WindowId r0 = r1.f23654a
            int r0 = r0.hashCode()
            return r0
    }
}
