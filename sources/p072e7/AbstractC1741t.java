package p072e7;

/* renamed from: e7.t */
/* loaded from: classes.dex */
public abstract class AbstractC1741t<E> extends p072e7.AbstractC1692o<E> implements java.util.Set<E> {

    /* renamed from: Z */
    public transient p072e7.AbstractC1722r<E> f7783Z;

    public AbstractC1741t() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L20
            r1 = 0
            if (r5 != r4) goto L7
            goto L20
        L7:
            boolean r2 = r5 instanceof java.util.Set
            if (r2 == 0) goto L1f
            java.util.Set r5 = (java.util.Set) r5
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L1f
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1f
            if (r2 != r3) goto L1f
            boolean r5 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1f
            if (r5 != 0) goto L1e
            goto L1f
        L1e:
            return r0
        L1f:
            r0 = 0
        L20:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            int r0 = p052d6.C1306f0.m3772a(r1)
            return r0
    }
}
