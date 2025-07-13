package p036c6;

/* renamed from: c6.l0 */
/* loaded from: classes.dex */
public final class C0896l0 implements android.os.Parcelable.Creator<p036c6.C0889i> {
    public C0896l0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0889i createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = p270p6.C5368b.m11710t(r12)
            r1 = 0
            r2 = 0
            r5 = r2
            r7 = r5
            r9 = 0
            r10 = 0
        Lb:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L41
            int r1 = r12.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 2
            if (r2 == r3) goto L3b
            r3 = 3
            if (r2 == r3) goto L35
            r3 = 4
            if (r2 == r3) goto L2f
            r3 = 5
            if (r2 == r3) goto L29
            p270p6.C5368b.m11709s(r12, r1)
            goto Lb
        L29:
            boolean r1 = p270p6.C5368b.m11700j(r12, r1)
            r10 = r1
            goto Lb
        L2f:
            boolean r1 = p270p6.C5368b.m11700j(r12, r1)
            r9 = r1
            goto Lb
        L35:
            long r1 = p270p6.C5368b.m11706p(r12, r1)
            r7 = r1
            goto Lb
        L3b:
            long r1 = p270p6.C5368b.m11706p(r12, r1)
            r5 = r1
            goto Lb
        L41:
            p270p6.C5368b.m11699i(r12, r0)
            c6.i r12 = new c6.i
            r4 = r12
            r4.<init>(r5, r7, r9, r10)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0889i[] newArray(int r1) {
            r0 = this;
            c6.i[] r1 = new p036c6.C0889i[r1]
            return r1
    }
}
