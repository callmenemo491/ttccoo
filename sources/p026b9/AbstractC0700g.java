package p026b9;

/* renamed from: b9.g */
/* loaded from: classes.dex */
public abstract class AbstractC0700g<K, V> implements p026b9.InterfaceC0723w<K, V> {

    /* renamed from: Y */
    public transient java.util.Set<K> f3954Y;

    /* renamed from: Z */
    public transient java.util.Collection<V> f3955Z;

    /* renamed from: a0 */
    public transient java.util.Map<K, java.util.Collection<V>> f3956a0;

    /* renamed from: b9.g$a */
    public class a extends java.util.AbstractCollection<V> {

        /* renamed from: Y */
        public final /* synthetic */ p026b9.AbstractC0700g f3957Y;

        public a(p026b9.AbstractC0700g r1) {
                r0 = this;
                r0.f3957Y = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                b9.g r0 = r1.f3957Y
                b9.e r0 = (p026b9.AbstractC0696e) r0
                r0.m2275d()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r3) {
                r2 = this;
                b9.g r0 = r2.f3957Y
                java.util.Map r0 = r0.mo2259a()
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.contains(r3)
                if (r1 == 0) goto Le
                r3 = 1
                goto L23
            L22:
                r3 = 0
            L23:
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                b9.g r0 = r2.f3957Y
                b9.e r0 = (p026b9.AbstractC0696e) r0
                java.util.Objects.requireNonNull(r0)
                b9.d r1 = new b9.d
                r1.<init>(r0)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                b9.g r0 = r1.f3957Y
                b9.e r0 = (p026b9.AbstractC0696e) r0
                int r0 = r0.f3916c0
                return r0
        }
    }

    public AbstractC0700g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p026b9.InterfaceC0723w
    /* renamed from: a */
    public abstract java.util.Map<K, java.util.Collection<V>> mo2259a();

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            goto L1b
        L4:
            boolean r0 = r2 instanceof p026b9.InterfaceC0723w
            if (r0 == 0) goto L1a
            b9.w r2 = (p026b9.InterfaceC0723w) r2
            r0 = r1
            b9.c r0 = (p026b9.AbstractC0692c) r0
            java.util.Map r0 = r0.mo2259a()
            java.util.Map r2 = r2.mo2259a()
            boolean r2 = r0.equals(r2)
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.mo2259a()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map r0 = r1.mo2259a()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
