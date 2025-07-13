package p221m9;

/* renamed from: m9.g */
/* loaded from: classes.dex */
public class C4451g extends p221m9.AbstractC4454h.a {

    /* renamed from: Y */
    public int f18129Y;

    /* renamed from: Z */
    public final int f18130Z;

    /* renamed from: a0 */
    public final /* synthetic */ p221m9.AbstractC4454h f18131a0;

    public C4451g(p221m9.AbstractC4454h r2) {
            r1 = this;
            r1.f18131a0 = r2
            r1.<init>()
            r0 = 0
            r1.f18129Y = r0
            int r2 = r2.size()
            r1.f18130Z = r2
            return
    }

    /* renamed from: a */
    public byte m9999a() {
            r2 = this;
            int r0 = r2.f18129Y
            int r1 = r2.f18130Z
            if (r0 >= r1) goto L11
            int r1 = r0 + 1
            r2.f18129Y = r1
            m9.h r1 = r2.f18131a0
            byte r0 = r1.mo10058m(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.f18129Y
            int r1 = r2.f18130Z
            if (r0 >= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
