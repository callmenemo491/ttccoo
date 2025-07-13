package p248o6;

/* renamed from: o6.z0 */
/* loaded from: classes.dex */
public final class C4947z0 implements android.os.Parcelable.Creator<p248o6.C4928q> {
    public C4947z0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p248o6.C4928q createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = p270p6.C5368b.m11710t(r10)
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        La:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L44
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r8 = 1
            if (r2 == r8) goto L3f
            r8 = 2
            if (r2 == r8) goto L3a
            r8 = 3
            if (r2 == r8) goto L35
            r8 = 4
            if (r2 == r8) goto L30
            r8 = 5
            if (r2 == r8) goto L2b
            p270p6.C5368b.m11709s(r10, r1)
            goto La
        L2b:
            int r7 = p270p6.C5368b.m11705o(r10, r1)
            goto La
        L30:
            int r6 = p270p6.C5368b.m11705o(r10, r1)
            goto La
        L35:
            boolean r5 = p270p6.C5368b.m11700j(r10, r1)
            goto La
        L3a:
            boolean r4 = p270p6.C5368b.m11700j(r10, r1)
            goto La
        L3f:
            int r3 = p270p6.C5368b.m11705o(r10, r1)
            goto La
        L44:
            p270p6.C5368b.m11699i(r10, r0)
            o6.q r10 = new o6.q
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p248o6.C4928q[] newArray(int r1) {
            r0 = this;
            o6.q[] r1 = new p248o6.C4928q[r1]
            return r1
    }
}
