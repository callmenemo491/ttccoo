package th;

/* renamed from: th.g */
/* loaded from: classes.dex */
public final class C6249g extends th.C6251i {
    /* renamed from: E */
    public static final <T> java.util.List<T> m12831E(th.InterfaceC6246d<? extends T> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r2.next()
            r0.add(r1)
            goto L9
        L17:
            java.util.List r2 = p074e9.C1805a.m4534s(r0)
            return r2
    }
}
