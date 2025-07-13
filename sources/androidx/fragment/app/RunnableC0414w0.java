package androidx.fragment.app;

/* renamed from: androidx.fragment.app.w0 */
/* loaded from: classes.dex */
public class RunnableC0414w0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ java.util.ArrayList f2416Y;

    /* renamed from: Z */
    public final /* synthetic */ java.util.Map f2417Z;

    public RunnableC0414w0(androidx.fragment.app.AbstractC0412v0 r1, java.util.ArrayList r2, java.util.Map r3) {
            r0 = this;
            r0.f2416Y = r2
            r0.f2417Z = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            java.util.ArrayList r0 = r7.f2416Y
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L47
            java.util.ArrayList r2 = r7.f2416Y
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            java.lang.String r3 = p227n0.C4661t.h.m10606k(r2)
            if (r3 == 0) goto L44
            java.util.Map r4 = r7.f2417Z
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L40
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L23
            java.lang.Object r3 = r5.getKey()
            java.lang.String r3 = (java.lang.String) r3
            goto L41
        L40:
            r3 = 0
        L41:
            p227n0.C4661t.h.m10617v(r2, r3)
        L44:
            int r1 = r1 + 1
            goto L7
        L47:
            return
    }
}
