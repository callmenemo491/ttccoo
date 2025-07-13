package p340t8;

/* renamed from: t8.k */
/* loaded from: classes.dex */
public class C6194k extends p340t8.C6195l.f {

    /* renamed from: b */
    public final /* synthetic */ java.util.List f24119b;

    /* renamed from: c */
    public final /* synthetic */ android.graphics.Matrix f24120c;

    public C6194k(p340t8.C6195l r1, java.util.List r2, android.graphics.Matrix r3) {
            r0 = this;
            r0.f24119b = r2
            r0.f24120c = r3
            r0.<init>()
            return
    }

    @Override // p340t8.C6195l.f
    /* renamed from: a */
    public void mo12796a(android.graphics.Matrix r3, p328s8.C5995a r4, int r5, android.graphics.Canvas r6) {
            r2 = this;
            java.util.List r3 = r2.f24119b
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r3.next()
            t8.l$f r0 = (p340t8.C6195l.f) r0
            android.graphics.Matrix r1 = r2.f24120c
            r0.mo12796a(r1, r4, r5, r6)
            goto L6
        L18:
            return
    }
}
