package p026b9;

/* renamed from: b9.s */
/* loaded from: classes.dex */
public enum EnumC0719s extends java.lang.Enum<p026b9.EnumC0719s> implements java.util.Iterator<java.lang.Object> {

    /* renamed from: Y */
    public static final p026b9.EnumC0719s f3995Y = null;

    /* renamed from: Z */
    public static final /* synthetic */ p026b9.EnumC0719s[] f3996Z = null;

    static {
            b9.s r0 = new b9.s
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            p026b9.EnumC0719s.f3995Y = r0
            r1 = 1
            b9.s[] r1 = new p026b9.EnumC0719s[r1]
            r1[r2] = r0
            p026b9.EnumC0719s.f3996Z = r1
            return
    }

    EnumC0719s(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static p026b9.EnumC0719s valueOf(java.lang.String r1) {
            java.lang.Class<b9.s> r0 = p026b9.EnumC0719s.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            b9.s r1 = (p026b9.EnumC0719s) r1
            return r1
    }

    public static p026b9.EnumC0719s[] values() {
            b9.s[] r0 = p026b9.EnumC0719s.f3996Z
            java.lang.Object r0 = r0.clone()
            b9.s[] r0 = (p026b9.EnumC0719s[]) r0
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            r0 = 0
            p026b9.C0720t.m2329c(r0)
            return
    }
}
