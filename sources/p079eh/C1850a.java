package p079eh;

/* renamed from: eh.a */
/* loaded from: classes.dex */
public class C1850a {

    /* renamed from: eh.a$a */
    public static final class a<T> implements java.util.Comparator {

        /* renamed from: Y */
        public final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>>[] f8034Y;

        public a(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>[] r1) {
                r0 = this;
                r0.f8034Y = r1
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r7, T r8) {
                r6 = this;
                kotlin.jvm.functions.Function1<T, java.lang.Comparable<?>>[] r0 = r6.f8034Y
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L20
                r4 = r0[r3]
                java.lang.Object r5 = r4.mo107b(r7)
                java.lang.Comparable r5 = (java.lang.Comparable) r5
                java.lang.Object r4 = r4.mo107b(r8)
                java.lang.Comparable r4 = (java.lang.Comparable) r4
                int r4 = p079eh.C1850a.m4597b(r5, r4)
                if (r4 == 0) goto L1d
                r2 = r4
                goto L20
            L1d:
                int r3 = r3 + 1
                goto L5
            L20:
                return r2
        }
    }

    /* renamed from: a */
    public static final <T> java.util.Comparator<T> m4596a(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>... r1) {
            int r0 = r1.length
            if (r0 <= 0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            if (r0 == 0) goto Le
            eh.a$a r0 = new eh.a$a
            r0.<init>(r1)
            return r0
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: b */
    public static final <T extends java.lang.Comparable<?>> int m4597b(T r0, T r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            if (r1 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r0.compareTo(r1)
            return r0
    }
}
