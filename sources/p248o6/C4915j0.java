package p248o6;

/* renamed from: o6.j0 */
/* loaded from: classes.dex */
public final class C4915j0 implements android.os.Parcelable.Creator<p248o6.C4904e> {
    public C4915j0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p248o6.C4904e createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = p270p6.C5368b.m11710t(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L4a
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L40
            r3 = 2
            if (r2 == r3) goto L3b
            r3 = 3
            if (r2 == r3) goto L36
            r3 = 4
            if (r2 == r3) goto L31
            r3 = 5
            if (r2 == r3) goto L2c
            p270p6.C5368b.m11709s(r10, r1)
            goto Lb
        L2c:
            int r8 = p270p6.C5368b.m11705o(r10, r1)
            goto Lb
        L31:
            int[] r7 = p270p6.C5368b.m11692b(r10, r1)
            goto Lb
        L36:
            boolean r6 = p270p6.C5368b.m11700j(r10, r1)
            goto Lb
        L3b:
            boolean r5 = p270p6.C5368b.m11700j(r10, r1)
            goto Lb
        L40:
            android.os.Parcelable$Creator<o6.q> r2 = p248o6.C4928q.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r10, r1, r2)
            r4 = r1
            o6.q r4 = (p248o6.C4928q) r4
            goto Lb
        L4a:
            p270p6.C5368b.m11699i(r10, r0)
            o6.e r10 = new o6.e
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p248o6.C4904e[] newArray(int r1) {
            r0 = this;
            o6.e[] r1 = new p248o6.C4904e[r1]
            return r1
    }
}
