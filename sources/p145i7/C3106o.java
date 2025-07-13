package p145i7;

/* renamed from: i7.o */
/* loaded from: classes.dex */
public final class C3106o extends p333t1.AbstractC6102f {

    /* renamed from: Y */
    public final androidx.appcompat.widget.C0311x f12496Y;

    public C3106o() {
            r2 = this;
            r0 = 1
            r2.<init>(r0)
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x
            r1 = 14
            r0.<init>(r1)
            r2.f12496Y = r0
            return
    }

    @Override // p333t1.AbstractC6102f
    /* renamed from: f */
    public final void mo7571f(java.lang.Throwable r5, java.lang.Throwable r6) {
            r4 = this;
            if (r6 == r5) goto L4a
            androidx.appcompat.widget.x r0 = r4.f12496Y
        L4:
            java.lang.Object r1 = r0.f1482a0
            java.lang.ref.ReferenceQueue r1 = (java.lang.ref.ReferenceQueue) r1
            java.lang.ref.Reference r1 = r1.poll()
            if (r1 == 0) goto L16
            java.lang.Object r2 = r0.f1481Z
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            r2.remove(r1)
            goto L4
        L16:
            i7.n r1 = new i7.n
            r2 = 0
            r1.<init>(r5, r2)
            java.lang.Object r2 = r0.f1481Z
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L29
            goto L46
        L29:
            java.util.Vector r1 = new java.util.Vector
            r2 = 2
            r1.<init>(r2)
            java.lang.Object r2 = r0.f1481Z
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            i7.n r3 = new i7.n
            java.lang.Object r0 = r0.f1482a0
            java.lang.ref.ReferenceQueue r0 = (java.lang.ref.ReferenceQueue) r0
            r3.<init>(r5, r0)
            java.lang.Object r5 = r2.putIfAbsent(r3, r1)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L45
            goto L46
        L45:
            r1 = r5
        L46:
            r1.add(r6)
            return
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Self suppression is not allowed."
            r5.<init>(r0, r6)
            throw r5
    }
}
