package p036c6;

/* renamed from: c6.n0 */
/* loaded from: classes.dex */
public final class C0900n0 implements android.os.Parcelable.Creator<p036c6.C0877c> {
    public C0900n0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0877c createFromParcel(android.os.Parcel r14) {
            r13 = this;
            int r0 = p270p6.C5368b.m11710t(r14)
            r1 = 0
            r2 = 0
            r9 = r1
            r10 = r9
            r5 = r2
            r7 = r5
            r11 = r7
        Lc:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L46
            int r1 = r14.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 2
            if (r2 == r3) goto L41
            r3 = 3
            if (r2 == r3) goto L3c
            r3 = 4
            if (r2 == r3) goto L37
            r3 = 5
            if (r2 == r3) goto L32
            r3 = 6
            if (r2 == r3) goto L2d
            p270p6.C5368b.m11709s(r14, r1)
            goto Lc
        L2d:
            long r11 = p270p6.C5368b.m11706p(r14, r1)
            goto Lc
        L32:
            java.lang.String r10 = p270p6.C5368b.m11695e(r14, r1)
            goto Lc
        L37:
            java.lang.String r9 = p270p6.C5368b.m11695e(r14, r1)
            goto Lc
        L3c:
            long r7 = p270p6.C5368b.m11706p(r14, r1)
            goto Lc
        L41:
            long r5 = p270p6.C5368b.m11706p(r14, r1)
            goto Lc
        L46:
            p270p6.C5368b.m11699i(r14, r0)
            c6.c r14 = new c6.c
            r4 = r14
            r4.<init>(r5, r7, r9, r10, r11)
            return r14
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0877c[] newArray(int r1) {
            r0 = this;
            c6.c[] r1 = new p036c6.C0877c[r1]
            return r1
    }
}
