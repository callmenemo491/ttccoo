package p010a9;

/* renamed from: a9.h */
/* loaded from: classes.dex */
public final class C0040h {

    /* renamed from: a9.h$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: a9.h$b */
    public static class b<T> implements p010a9.InterfaceC0039g<T>, java.io.Serializable {

        /* renamed from: Y */
        public final java.util.List<? extends p010a9.InterfaceC0039g<? super T>> f87Y;

        public b(java.util.List r1, p010a9.C0040h.a r2) {
                r0 = this;
                r0.<init>()
                r0.f87Y = r1
                return
        }

        @Override // p010a9.InterfaceC0039g
        public boolean apply(T r4) {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                java.util.List<? extends a9.g<? super T>> r2 = r3.f87Y
                int r2 = r2.size()
                if (r1 >= r2) goto L1c
                java.util.List<? extends a9.g<? super T>> r2 = r3.f87Y
                java.lang.Object r2 = r2.get(r1)
                a9.g r2 = (p010a9.InterfaceC0039g) r2
                boolean r2 = r2.apply(r4)
                if (r2 != 0) goto L19
                return r0
            L19:
                int r1 = r1 + 1
                goto L2
            L1c:
                r4 = 1
                return r4
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof p010a9.C0040h.b
                if (r0 == 0) goto Lf
                a9.h$b r2 = (p010a9.C0040h.b) r2
                java.util.List<? extends a9.g<? super T>> r0 = r1.f87Y
                java.util.List<? extends a9.g<? super T>> r2 = r2.f87Y
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r2 = this;
                java.util.List<? extends a9.g<? super T>> r0 = r2.f87Y
                int r0 = r0.hashCode()
                r1 = 306654252(0x12472c2c, float:6.2847774E-28)
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.util.List<? extends a9.g<? super T>> r0 = r4.f87Y
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Predicates."
                r1.<init>(r2)
                java.lang.String r2 = "and"
                r1.append(r2)
                r2 = 40
                r1.append(r2)
                java.util.Iterator r0 = r0.iterator()
                r2 = 1
            L18:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L2e
                java.lang.Object r3 = r0.next()
                if (r2 != 0) goto L29
                r2 = 44
                r1.append(r2)
            L29:
                r1.append(r3)
                r2 = 0
                goto L18
            L2e:
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    /* renamed from: a */
    public static <T> p010a9.InterfaceC0039g<T> m40a(p010a9.InterfaceC0039g<? super T> r3, p010a9.InterfaceC0039g<? super T> r4) {
            a9.h$b r0 = new a9.h$b
            java.util.Objects.requireNonNull(r3)
            java.util.Objects.requireNonNull(r4)
            r1 = 2
            a9.g[] r1 = new p010a9.InterfaceC0039g[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.util.List r3 = java.util.Arrays.asList(r1)
            r4 = 0
            r0.<init>(r3, r4)
            return r0
    }
}
