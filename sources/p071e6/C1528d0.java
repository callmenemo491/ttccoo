package p071e6;

/* renamed from: e6.d0 */
/* loaded from: classes.dex */
public final class C1528d0 extends android.util.LruCache<java.lang.Integer, p036c6.C0899n> {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1064a f7407a;

    public C1528d0(com.google.android.gms.cast.framework.media.C1064a r1, int r2) {
            r0 = this;
            r0.f7407a = r1
            r0.<init>(r2)
            return
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean r1, java.lang.Integer r2, p036c6.C0899n r3, p036c6.C0899n r4) {
            r0 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2
            c6.n r3 = (p036c6.C0899n) r3
            c6.n r4 = (p036c6.C0899n) r4
            if (r1 != 0) goto L9
            return
        L9:
            com.google.android.gms.cast.framework.media.a r1 = r0.f7407a
            java.util.List<java.lang.Integer> r1 = r1.f5480g
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r1, r3)
            com.google.android.gms.cast.framework.media.a r1 = r0.f7407a
            java.util.List<java.lang.Integer> r1 = r1.f5480g
            r1.add(r2)
            return
    }
}
