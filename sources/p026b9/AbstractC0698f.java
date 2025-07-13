package p026b9;

/* renamed from: b9.f */
/* loaded from: classes.dex */
public abstract class AbstractC0698f<K, V> implements java.util.Map.Entry<K, V> {
    public AbstractC0698f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L23
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r0 = r4
            b9.m r0 = (p026b9.C0712m) r0
            K r2 = r0.f3977Y
            java.lang.Object r3 = r5.getKey()
            boolean r2 = p185k7.C3836i.m8619d(r2, r3)
            if (r2 == 0) goto L23
            V r0 = r0.f3978Z
            java.lang.Object r5 = r5.getValue()
            boolean r5 = p185k7.C3836i.m8619d(r0, r5)
            if (r5 == 0) goto L23
            r1 = 1
        L23:
            return r1
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
            r3 = this;
            r0 = r3
            b9.m r0 = (p026b9.C0712m) r0
            K r1 = r0.f3977Y
            V r0 = r0.f3978Z
            r2 = 0
            if (r1 != 0) goto Lc
            r1 = 0
            goto L10
        Lc:
            int r1 = r1.hashCode()
        L10:
            if (r0 != 0) goto L13
            goto L17
        L13:
            int r2 = r0.hashCode()
        L17:
            r0 = r1 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r3
            b9.m r1 = (p026b9.C0712m) r1
            K r2 = r1.f3977Y
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            V r1 = r1.f3978Z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
