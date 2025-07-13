package p248o6;

/* renamed from: o6.a0 */
/* loaded from: classes.dex */
public final class C4895a0 implements android.os.Parcelable.Creator<p248o6.C4898b0> {
    public C4895a0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p248o6.C4898b0 createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = p270p6.C5368b.m11710t(r13)
            r1 = 0
            r2 = 0
            r8 = r2
            r10 = r8
            r5 = 0
            r6 = 0
            r7 = 0
        Lc:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L46
            int r1 = r13.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L41
            r3 = 2
            if (r2 == r3) goto L3c
            r3 = 3
            if (r2 == r3) goto L37
            r3 = 4
            if (r2 == r3) goto L32
            r3 = 5
            if (r2 == r3) goto L2d
            p270p6.C5368b.m11709s(r13, r1)
            goto Lc
        L2d:
            long r10 = p270p6.C5368b.m11706p(r13, r1)
            goto Lc
        L32:
            long r8 = p270p6.C5368b.m11706p(r13, r1)
            goto Lc
        L37:
            int r7 = p270p6.C5368b.m11705o(r13, r1)
            goto Lc
        L3c:
            int r6 = p270p6.C5368b.m11705o(r13, r1)
            goto Lc
        L41:
            int r5 = p270p6.C5368b.m11705o(r13, r1)
            goto Lc
        L46:
            p270p6.C5368b.m11699i(r13, r0)
            o6.b0 r13 = new o6.b0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r10)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p248o6.C4898b0[] newArray(int r1) {
            r0 = this;
            o6.b0[] r1 = new p248o6.C4898b0[r1]
            return r1
    }
}
