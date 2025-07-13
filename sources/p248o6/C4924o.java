package p248o6;

/* renamed from: o6.o */
/* loaded from: classes.dex */
public final class C4924o {

    /* renamed from: o6.o$a */
    public static final class a {

        /* renamed from: a */
        public final java.util.List<java.lang.String> f19527a;

        /* renamed from: b */
        public final java.lang.Object f19528b;

        public a(java.lang.Object r1, p052d6.C1310h0 r2) {
                r0 = this;
                r0.<init>()
                java.lang.String r2 = "null reference"
                java.util.Objects.requireNonNull(r1, r2)
                r0.f19528b = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f19527a = r1
                return
        }

        @androidx.annotation.RecentlyNonNull
        /* renamed from: a */
        public final p248o6.C4924o.a m11075a(@androidx.annotation.RecentlyNonNull java.lang.String r4, java.lang.Object r5) {
                r3 = this;
                java.util.List<java.lang.String> r0 = r3.f19527a
                java.lang.String r5 = java.lang.String.valueOf(r5)
                int r1 = r4.length()
                int r1 = r1 + 1
                int r2 = r5.length()
                int r2 = r2 + r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r2)
                r1.append(r4)
                java.lang.String r4 = "="
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r0.add(r4)
                return r3
        }

        @androidx.annotation.RecentlyNonNull
        public final java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 100
                r0.<init>(r1)
                java.lang.Object r1 = r4.f19528b
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                r1 = 123(0x7b, float:1.72E-43)
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r4.f19527a
                int r1 = r1.size()
                r2 = 0
            L20:
                if (r2 >= r1) goto L39
                java.util.List<java.lang.String> r3 = r4.f19527a
                java.lang.Object r3 = r3.get(r2)
                java.lang.String r3 = (java.lang.String) r3
                r0.append(r3)
                int r3 = r1 + (-1)
                if (r2 >= r3) goto L36
                java.lang.String r3 = ", "
                r0.append(r3)
            L36:
                int r2 = r2 + 1
                goto L20
            L39:
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: a */
    public static boolean m11074a(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }
}
