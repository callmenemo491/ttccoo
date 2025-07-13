package p079eh;

/* renamed from: eh.c */
/* loaded from: classes.dex */
public final class C1852c implements java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> {

    /* renamed from: Y */
    public static final p079eh.C1852c f8036Y = null;

    static {
            eh.c r0 = new eh.c
            r0.<init>()
            p079eh.C1852c.f8036Y = r0
            return
    }

    public C1852c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Comparable<? super java.lang.Object> r2, java.lang.Comparable<? super java.lang.Object> r3) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.lang.String r0 = "a"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "b"
            p214m2.C4339q.m9706k(r3, r0)
            int r2 = r3.compareTo(r2)
            return r2
    }

    @Override // java.util.Comparator
    public final java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> reversed() {
            r1 = this;
            eh.b r0 = p079eh.C1851b.f8035Y
            return r0
    }
}
