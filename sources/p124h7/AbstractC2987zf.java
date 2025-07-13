package p124h7;

/* renamed from: h7.zf */
/* loaded from: classes.dex */
public abstract class AbstractC2987zf implements java.util.Iterator {
    public AbstractC2987zf() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract byte mo7327a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            byte r0 = r1.mo7327a()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
